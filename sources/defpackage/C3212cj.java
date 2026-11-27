package defpackage;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3212cj implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C3212cj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3003bj((GX1) ((C3181cb0) this.b).get());
            case 1:
                return new P21((MU) ((M3) this.b).get());
            default:
                Context context = ((C6731tE1) this.b).a.a;
                ArrayList arrayList = new ArrayList(3);
                TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
                arrayList.add(new C7176vN());
                arrayList.add(new C8027zQ0());
                arrayList.add(new C6521sE1());
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
                }
                C3242cr1 c3242cr1 = new C3242cr1(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c3242cr1.a((InterfaceC4217hX0) it.next());
                }
                ArrayList<InterfaceC4217hX0> arrayList2 = c3242cr1.b;
                C6595sc1.a aVar = new C6595sc1.a();
                float f = context.getResources().getDisplayMetrics().density;
                C4685jX0.a aVar2 = new C4685jX0.a();
                aVar2.d = (int) ((8 * f) + 0.5f);
                aVar2.a = (int) ((24 * f) + 0.5f);
                int i = (int) ((4 * f) + 0.5f);
                aVar2.b = i;
                int i2 = (int) ((1 * f) + 0.5f);
                aVar2.c = i2;
                aVar2.e = i2;
                aVar2.f = i;
                C3797fX0.a aVar3 = new C3797fX0.a();
                C5318mX0.a aVar4 = new C5318mX0.a();
                C4427iX0.a aVar5 = new C4427iX0.a();
                for (InterfaceC4217hX0 interfaceC4217hX0 : arrayList2) {
                    interfaceC4217hX0.getClass();
                    interfaceC4217hX0.f(aVar4);
                    interfaceC4217hX0.a(aVar5);
                }
                C4685jX0 c4685jX0 = new C4685jX0(aVar2);
                C4427iX0 c4427iX0 = new C4427iX0(Collections.unmodifiableMap(aVar5.a));
                aVar3.a = c4685jX0;
                aVar3.g = c4427iX0;
                if (aVar3.b == null) {
                    aVar3.b = new LL(8);
                }
                if (aVar3.c == null) {
                    aVar3.c = new N7();
                }
                if (aVar3.d == null) {
                    aVar3.d = new C6346rQ0();
                }
                if (aVar3.e == null) {
                    aVar3.e = new AbstractC4773jw0.a();
                }
                if (aVar3.f == null) {
                    aVar3.f = new C3476e();
                }
                C4007gX0 c4007gX0 = new C4007gX0(new C6595sc1(aVar), new C5105lX0(aVar4, new C3797fX0(aVar3)), Collections.unmodifiableList(arrayList2));
                Intrinsics.checkNotNullExpressionValue(c4007gX0, "builder(sdkContext.appCo… }\n            }).build()");
                return c4007gX0;
        }
    }
}
