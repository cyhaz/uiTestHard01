package kr.co.tjoeun.uitesthard01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button loginBtn = null;
    TextView findPwTxt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);
        findPwTxt = findViewById(R.id.findPwTxt);

//        로그인버튼의 글자를 => 회원가입으로 바꾸자
        loginBtn.setText("회원가입");

//        비밀번호 찾기 텍스트뷰 => "비번 찾기" 로 변경
//        findPwTxt 로 id 부여
        findPwTxt.setText("비번 찾기");

    }
}
