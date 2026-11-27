package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2684aG0 extends C3956gG0 implements FG {
    public final boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2684aG0(@Nullable XF0 xf0) {
        super(true);
        boolean z = true;
        V(xf0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C3956gG0.e;
        WB wb = (WB) atomicReferenceFieldUpdater.get(this);
        XB xb = wb instanceof XB ? (XB) wb : null;
        if (xb == null) {
            z = false;
            break;
        }
        C3956gG0 c3956gG0L = xb.l();
        while (!c3956gG0L.O()) {
            WB wb2 = (WB) atomicReferenceFieldUpdater.get(c3956gG0L);
            XB xb2 = wb2 instanceof XB ? (XB) wb2 : null;
            if (xb2 == null) {
                z = false;
                break;
            }
            c3956gG0L = xb2.l();
        }
        this.g = z;
    }

    @Override // defpackage.C3956gG0
    public final boolean O() {
        return this.g;
    }

    @Override // defpackage.C3956gG0
    public final boolean Q() {
        return true;
    }

    @Override // defpackage.FG
    public final boolean X() {
        return c0(Unit.a);
    }

    @Override // defpackage.FG
    public final boolean k(@NotNull Throwable th) {
        return c0(new OG(th, false));
    }
}
