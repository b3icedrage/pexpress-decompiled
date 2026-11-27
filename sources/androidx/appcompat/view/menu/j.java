package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface j {

    public interface a {
        void c(@NonNull f fVar, boolean z);

        boolean d(@NonNull f fVar);
    }

    void c(f fVar, boolean z);

    void d(boolean z);

    boolean e();

    void f(a aVar);

    boolean g(h hVar);

    int getId();

    void h(Context context, f fVar);

    void i(Parcelable parcelable);

    boolean k(m mVar);

    Parcelable l();

    boolean m(h hVar);
}
