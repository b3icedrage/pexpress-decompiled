package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: Go, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1074Go extends AbstractC5259mD1 {
    public final InterfaceC3529eE a;
    public final HashMap b;

    public C1074Go(InterfaceC3529eE interfaceC3529eE, HashMap map) {
        this.a = interfaceC3529eE;
        this.b = map;
    }

    @Override // defpackage.AbstractC5259mD1
    public final InterfaceC3529eE a() {
        return this.a;
    }

    @Override // defpackage.AbstractC5259mD1
    public final Map<EnumC6825th1, AbstractC5259mD1.a> c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5259mD1)) {
            return false;
        }
        AbstractC5259mD1 abstractC5259mD1 = (AbstractC5259mD1) obj;
        return this.a.equals(abstractC5259mD1.a()) && this.b.equals(abstractC5259mD1.c());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.a + ", values=" + this.b + "}";
    }
}
