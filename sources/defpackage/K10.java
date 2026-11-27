package defpackage;

import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K10 extends C2784ak0 implements Function1 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K10(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                String indicatorKey = (String) obj;
                Intrinsics.checkNotNullParameter(indicatorKey, "p0");
                BR0 br0 = (BR0) this.e;
                br0.getClass();
                Intrinsics.checkNotNullParameter(indicatorKey, "indicatorKey");
                for (E10 e10 : C5907pJ1.d(br0.a, br0.b)) {
                    if (Intrinsics.a(e10.a(), indicatorKey)) {
                        e10.a();
                        return e10;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            default:
                return ((RU1) this.e).a((JM) obj);
        }
    }
}
