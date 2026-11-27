package defpackage;

import com.pexpress.tool.R;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class T3 implements S3 {

    @NotNull
    public final R3 a = new R3(R.string.main_robot_real_account_text, R.drawable.ic_robot_account_real, 13);

    @NotNull
    public final R3 b;

    @NotNull
    public final R3 c;

    public T3() {
        int i = R.drawable.ic_robot_account_demo;
        int i2 = R.string.main_robot_demo_account_text;
        this.b = new R3(i2, i, 21);
        this.c = new R3(i2, 0, 53);
    }

    @Override // defpackage.S3
    @NotNull
    public final R3 a() {
        return this.c;
    }

    @Override // defpackage.S3
    @NotNull
    public final R3 b() {
        return this.a;
    }

    @Override // defpackage.S3
    @NotNull
    public final R3 c() {
        return this.b;
    }
}
