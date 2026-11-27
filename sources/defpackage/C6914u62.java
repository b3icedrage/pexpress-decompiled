package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: u62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6914u62 extends AbstractC7124v62 {
    public final /* synthetic */ Map<InterfaceC6494s62, N62> c;

    public C6914u62(Map map) {
        this.c = map;
    }

    @Override // defpackage.T62
    public final boolean a() {
        return false;
    }

    @Override // defpackage.T62
    public final boolean f() {
        return this.c.isEmpty();
    }

    @Override // defpackage.AbstractC7124v62
    public final N62 h(InterfaceC6494s62 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.c.get(key);
    }
}
