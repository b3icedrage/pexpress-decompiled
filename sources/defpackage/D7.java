package defpackage;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D7<T> {
    public final int a;
    public final int b;

    public D7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @NotNull
    public abstract H7<T> a(@NotNull View view);
}
