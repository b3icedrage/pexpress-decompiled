package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class X implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ X(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [ak0, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        switch (this.d) {
            case 0:
                return it == ((Y) this.e) ? "(this Collection)" : String.valueOf(it);
            case 1:
                Intrinsics.checkNotNullParameter((View) it, "it");
                ((C2784ak0) this.e).invoke();
                return Unit.a;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ((Function0) this.e).invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ X(Function0 function0) {
        this.d = 1;
        this.e = (C2784ak0) function0;
    }
}
