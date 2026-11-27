package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6524sF1 extends AbstractC7992zE1<C6524sF1> {
    public final /* synthetic */ AtomicReferenceArray i;

    public C6524sF1(long j, @Nullable C6524sF1 c6524sF1, int i) {
        super(j, c6524sF1, i);
        this.i = new AtomicReferenceArray(C6314rF1.f);
    }

    @Override // defpackage.AbstractC7992zE1
    public final int g() {
        return C6314rF1.f;
    }

    @Override // defpackage.AbstractC7992zE1
    public final void h(int i, @NotNull CoroutineContext coroutineContext) {
        this.i.set(i, C6314rF1.e);
        i();
    }

    @NotNull
    public final String toString() {
        return "SemaphoreSegment[id=" + this.g + ", hashCode=" + hashCode() + ']';
    }
}
