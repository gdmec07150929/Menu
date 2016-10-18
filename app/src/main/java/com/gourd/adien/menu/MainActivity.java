package com.gourd.adien.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.textView);
        registerForContextMenu(tv1);
    }

    //选项菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //MenuInflater mi = getMenuInflater();
        //mi.inflate(R.menu.menu,menu);
        menu.add(0,1,0,R.string.app_name1);
        menu.add(0,1,0,R.string.app_name2);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle().toString(), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    //上下文菜单
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0,1,0,R.string.app_name1);
        menu.add(0,1,0,R.string.app_name2);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this,item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onContextItemSelected(item);
    }
}
