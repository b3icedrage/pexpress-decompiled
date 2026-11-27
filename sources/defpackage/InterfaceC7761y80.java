package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: y80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7761y80 extends C7716xw0.b {

    @NotNull
    public static final C7340w80 a = new C7340w80();

    /* JADX INFO: renamed from: y80$a */
    public interface a {

        @NotNull
        public static final C7551x80 a;

        static {
            C7340w80 listener = InterfaceC7761y80.a;
            Intrinsics.checkNotNullParameter(listener, "listener");
            a = new C7551x80();
        }
    }

    void a(@NotNull C7716xw0 c7716xw0, @NotNull Bitmap bitmap);

    void d(@NotNull C7716xw0 c7716xw0);

    void e(@NotNull C7716xw0 c7716xw0, @NotNull Object obj);

    void f(@NotNull C7716xw0 c7716xw0, @NotNull InterfaceC5122lc0<?> interfaceC5122lc0, @NotNull C4695ja1 c4695ja1, @NotNull AbstractC4912kc0 abstractC4912kc0);

    void g(@NotNull C7716xw0 c7716xw0);

    void h(@NotNull C7716xw0 c7716xw0);

    void j(@NotNull C7716xw0 c7716xw0, @NotNull LM1 lm1);

    void l(@NotNull C7716xw0 c7716xw0, @NotNull Bitmap bitmap);

    void m(@NotNull C7716xw0 c7716xw0, @NotNull InterfaceC8038zU interfaceC8038zU, @NotNull C4695ja1 c4695ja1, @NotNull C7197vU c7197vU);

    void n(@NotNull C7716xw0 c7716xw0, @NotNull Object obj);

    void o(@NotNull C7716xw0 c7716xw0, @NotNull InterfaceC5122lc0<?> interfaceC5122lc0, @NotNull C4695ja1 c4695ja1);

    void p(@NotNull C7716xw0 c7716xw0, @NotNull InterfaceC8038zU interfaceC8038zU, @NotNull C4695ja1 c4695ja1);
}
