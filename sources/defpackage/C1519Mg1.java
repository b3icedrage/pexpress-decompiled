package defpackage;

import android.graphics.drawable.Drawable;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Mg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1519Mg1 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C1519Mg1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                AbstractC0662Bg1 safeGet = (AbstractC0662Bg1) obj;
                Intrinsics.checkNotNullParameter(safeGet, "$this$safeGet");
                return safeGet.b(((InterfaceC7031ug1) this.e).getKey());
            default:
                C4133h61 it = (C4133h61) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                C2119Tx1 c2119Tx1 = (C2119Tx1) this.e;
                it.e(c2119Tx1.a.getString(R.string.searching_for_signals_text));
                it.d("");
                Drawable drawableD = C7652xe.d(c2119Tx1.a, R.drawable.ic_searching_signals);
                it.h(drawableD != null ? H30.a(drawableD) : null);
                it.i(100, true, 0);
                return Unit.a;
        }
    }
}
