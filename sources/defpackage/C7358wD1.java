package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: wD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7358wD1 implements InterfaceC5541nb0<AbstractC5259mD1> {
    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        Cm2 cm2 = new Cm2();
        HashMap map = new HashMap();
        EnumC6825th1 enumC6825th1 = EnumC6825th1.d;
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(enumC6825th1, new C1152Ho(30000L, 86400000L, set));
        EnumC6825th1 enumC6825th2 = EnumC6825th1.g;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(enumC6825th2, new C1152Ho(1000L, 86400000L, set));
        EnumC6825th1 enumC6825th3 = EnumC6825th1.e;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(AbstractC5259mD1.b.e)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(enumC6825th3, new C1152Ho(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() < EnumC6825th1.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new C1074Go(cm2, map);
    }
}
