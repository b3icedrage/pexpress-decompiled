package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Wo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2329Wo0 extends ML0 implements Function1 {
    public static final C2329Wo0 e = new C2329Wo0(1, 0);
    public static final C2329Wo0 g = new C2329Wo0(1, 1);
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2329Wo0(int i, int i2) {
        super(i);
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                C4201hS c4201hS = C6104qF0.a;
                C6104qF0.b("An unsuccessful attempt to get history, error - " + it);
                return Unit.a;
            default:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null) {
                    return new Jd2(viewGroup);
                }
                return null;
        }
    }
}
