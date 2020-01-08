package gmall.atguigu.com.user.service;

import gmall.atguigu.com.user.beans.UmsMember;
import gmall.atguigu.com.user.beans.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUsers();
    List<UmsMemberReceiveAddress>  getUmsMemberReceiveAddressByMemberId(String memberid);
}
