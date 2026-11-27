package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.migration.AndroidStorageMigration", f = "AndroidStorageMigration.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE, 29, 35, 44}, m = "moveEventsToDestination")
public final class C1113Hb extends LM {
    public C1347Kb d;
    public Iterator e;
    public String g;
    public List h;
    public Iterator i;
    public C0612Aq j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ C1347Kb m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1113Hb(C1347Kb c1347Kb, LM lm) {
        super(lm);
        this.m = c1347Kb;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(this);
    }
}
