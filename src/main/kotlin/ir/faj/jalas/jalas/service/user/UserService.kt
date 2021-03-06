package ir.faj.jalas.jalas.service.user

import ir.faj.jalas.jalas.controllers.model.NotificationRequest
import ir.faj.jalas.jalas.controllers.model.UserRegisterRequest
import ir.faj.jalas.jalas.dto.rdbms.UserShallowDto
import ir.faj.jalas.jalas.entities.Session
import ir.faj.jalas.jalas.entities.User
import java.security.Principal

interface UserService {
    fun getUserSession(username: String): List<Session>
    fun register(request: UserRegisterRequest): UserShallowDto
    fun findByUserName(principal: Principal): User
    fun getUserInfo(username: String): UserShallowDto
    fun deleteUserFromSession(userId: Int, sessionId: Int, user: User):List<UserShallowDto>
    fun addNotification(request: NotificationRequest, user: User)
}