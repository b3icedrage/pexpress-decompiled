package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.bumptech.glide.a;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3435dm0 {

    @NotNull
    public static final KW1 a = XO0.b(new C5668oA(1));

    public static final B30 a() {
        return (B30) a.getValue();
    }

    public static void b(ImageView imageView, String str) {
        C4195hQ onLoadFailed = new C4195hQ(2);
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(onLoadFailed, "onLoadFailed");
        ((C6025ps1) a.d(imageView).n(str).m()).T(M30.b(a())).O(new C2580Zl0(new Handler(Looper.getMainLooper()), onLoadFailed)).N(imageView);
    }

    public static void c(ImageView imageView, String str, int i) {
        C2424Xl0 onLoadFailed = new C2424Xl0();
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(onLoadFailed, "onLoadFailed");
        ((C6025ps1) a.d(imageView).n(str).m()).T(M30.b(a())).t(i).O(new C3016bm0(new Handler(Looper.getMainLooper()), imageView, str, i, onLoadFailed)).N(imageView);
    }

    public static final void d(@NotNull ImageView imageView, int i) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        a.d(imageView).g().Q(Integer.valueOf(i)).N(imageView);
    }

    public static final void e(@NotNull ImageView imageView, int i, @NotNull EnumC7035uh1 priority) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(priority, "priority");
        a.d(imageView).m(Integer.valueOf(i)).v(priority).T(M30.b(a())).N(imageView);
    }

    public static final void f(@NotNull ImageView imageView, @Nullable String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        a.d(imageView).n(str).T(M30.b(a())).N(imageView);
    }

    public static final void h(@NotNull ImageView imageView, @Nullable String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        C6025ps1 c6025ps1T = a.d(imageView).g().R(str).t(i);
        M30 m30 = new M30();
        m30.d = new B30(false);
        c6025ps1T.T(m30).N(imageView);
    }

    public static final void i(@NotNull ImageView imageView, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        a.d(imageView).m(num).T(M30.b(a())).h(AbstractC2634a20.a).t(R.drawable.ic_trading_asset_not_loaded_icon).N(imageView);
    }

    public static final void j(@NotNull ImageView imageView, @Nullable String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        a.d(imageView).n(str).T(M30.b(a())).h(AbstractC2634a20.a).t(i).O(new CW1(imageView, str, i)).N(imageView);
    }
}
