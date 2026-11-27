package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6891u1 implements Function1 {
    public final AbstractCollection d;
    public final C6075q62 e;
    public final InterfaceC4366iD g;
    public final InterfaceC6126qM1 h;

    public C6891u1(AbstractCollection abstractCollection, C6075q62 c6075q62, InterfaceC4366iD interfaceC4366iD, InterfaceC6126qM1 interfaceC6126qM1) {
        this.d = abstractCollection;
        this.e = c6075q62;
        this.g = interfaceC4366iD;
        this.h = interfaceC6126qM1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C6075q62.a runForkingPoint = (C6075q62.a) obj;
        Intrinsics.checkNotNullParameter(runForkingPoint, "$this$runForkingPoint");
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            runForkingPoint.a(new C7101v1(this.e, this.g, (InterfaceC6126qM1) it.next(), this.h));
        }
        return Unit.a;
    }
}
