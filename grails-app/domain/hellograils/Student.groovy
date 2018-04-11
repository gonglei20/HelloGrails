package hellograils

class Student {

    String name
    String sid
    String gender
    String email
    Date enrollDate
    static constraints = {
        name(size: 3..10);
        sid(matches: /\d{8}/)
        gender(inList: ['男','女'])
        email(email: true)
        enrollDate()
    }
}
