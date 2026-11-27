package defpackage;

import android.view.View;
import com.pexpress.tool.AppImpl;
import com.pexpress.tool.MainActivityImpl;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: Vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2222Vg implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C2222Vg(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                Throwable error = (Throwable) obj;
                int i = AppImpl.G;
                Intrinsics.checkNotNullParameter(error, "error");
                ((InterfaceC3706f42) obj2).g(error);
                return Unit.a;
            case 1:
                C0857Dt1 it = (C0857Dt1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i2 = it.h;
                C1318Jr0 c1318Jr0 = it.d.a;
                ((C5157ll) obj2).getClass();
                Regex regex = C6650sr0.a;
                return i2 + " " + C6650sr0.a(c1318Jr0.i);
            default:
                int i3 = MainActivityImpl.R;
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                Cd2.c.c((View) obj2);
                return Unit.a;
        }
    }
}
