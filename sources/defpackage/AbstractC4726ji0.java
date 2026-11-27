package defpackage;

import android.os.Handler;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.fragment.app.g;
import java.io.PrintWriter;

/* JADX INFO: renamed from: ji0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4726ji0<E> extends AbstractC3000bi0 {
    public final g d;

    @NonNull
    public final g e;

    @NonNull
    public final Handler g;
    public final C6828ti0 h;

    public AbstractC4726ji0(@NonNull g gVar) {
        Handler handler = new Handler();
        this.h = new C6828ti0();
        this.d = gVar;
        this.e = gVar;
        this.g = handler;
    }

    public abstract void d(@NonNull PrintWriter printWriter, String[] strArr);

    public abstract g e();

    @NonNull
    public abstract LayoutInflater f();

    public abstract boolean g(@NonNull String str);

    public abstract void h();
}
