package defpackage;

import android.widget.ProgressBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class LI extends ML0 implements Function1 {
    public static final LI e = new LI(1, 0);
    public static final LI g = new LI(1, 1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LI(int i, int i2) {
        super(i);
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Intrinsics.checkNotNullParameter((GL) obj, "$this$null");
                return Unit.a;
            default:
                return Boolean.valueOf(obj instanceof ProgressBar);
        }
    }
}
