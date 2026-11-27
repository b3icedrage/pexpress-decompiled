package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class E52 implements InterfaceC7191vS<AbstractC0662Bg1> {
    @Override // defpackage.InterfaceC7191vS
    @Nullable
    public final Unit j() {
        return Unit.a;
    }

    @Override // defpackage.InterfaceC7191vS
    public final Object k(JM jm, Object obj) {
        Object next;
        Iterator<T> it = ((AbstractC0662Bg1) obj).a().keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.a(((AbstractC0662Bg1.a) next).a, AbstractC1357Ke0.d.a));
        return Boolean.valueOf(next != null);
    }

    @Override // defpackage.InterfaceC7191vS
    public final Object l(Object obj, C7822yS c7822yS) {
        Y11 y11 = new Y11(PW0.l(((AbstractC0662Bg1) obj).a()), false);
        AbstractC0662Bg1.a<Boolean> key = AbstractC1357Ke0.d;
        Boolean bool = Boolean.TRUE;
        Intrinsics.checkNotNullParameter(key, "key");
        y11.d(key, bool);
        return new Y11(PW0.l(y11.a()), true);
    }
}
