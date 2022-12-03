package com.mycompany.myapp.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

//@Repository
public class BoardDAO {
    @Autowired
    private JdbcTemplate template;
    private final String BOARD_INSERT = "insert into BOARD (groups, home,gre,hscore,gscore,shoot,warning,leaves) values (?,?,?,?,?,?,?,?)";
    private final String BOARD_UPDATE = "update BOARD set `groups`=?, home=?, gre=?, hscore=?,gscore=?,shoot=?,warning=?,leaves=? where seq=?";
    private final String BOARD_DELETE = "delete from BOARD where seq=?";
    private final String BOARD_GET="select * from BOARD where seq=?";
    private final String BOARD_LIST="select * from BOARD order by seq desc";
    public int insertBoard(BoardVO vo){
        return template.update(BOARD_INSERT,new Object[]{vo.getGroups(),vo.getHome(),vo.getGre(),vo.getHscore(),vo.getGscore(),vo.getShoot(),vo.getWarning(),vo.getLeaves()});
    }
    public int delete(int id){
        return template.update(BOARD_DELETE,new Object[]{id});
    }

    public int updateBoard(BoardVO vo){
        return template.update(BOARD_UPDATE,new Object[]{vo.getGroups(),vo.getHome(),vo.getGre(),vo.getHscore(),vo.getGscore(),vo.getShoot(),vo.getWarning(),vo.getLeaves(),vo.getSeq()});
    }

    public BoardVO getBoard(int seq){
        return template.queryForObject(BOARD_GET,new BeanPropertyRowMapper<BoardVO>(BoardVO.class),new Object[]{seq});
//        BoardVO boardVO = template.queryForObject(BOARD_GET,new BeanPropertyRowMapper<BoardVO>(BoardVO.class),new Object[]{seq});
//        System.out.println("boardVO.getSeq() = " + boardVO.getSeq());
//        return boardVO;
    }

    public List<BoardVO> getBoardList() {
        return template.query(BOARD_LIST, new RowMapper<BoardVO>() {
            public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
                BoardVO data = new BoardVO();
                data.setSeq(rs.getInt("seq"));
                data.setGroups(rs.getString("groups"));
                data.setRegdate(rs.getDate("regdate"));
                data.setHome(rs.getString("home"));
                data.setGre(rs.getString("gre"));
                data.setHscore(rs.getString("hscore"));
                data.setGscore(rs.getString("gscore"));
                data.setShoot(rs.getString("shoot"));
                data.setWarning(rs.getString("warning"));
                data.setLeaves(rs.getString("leaves"));
                return data;
            }
        });
    }

    public void setTemplate(JdbcTemplate template) {
        this.template=template;
    }
}
