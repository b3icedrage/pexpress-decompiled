package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LLM;", "Lwq;", "LJM;", "", "completion", "Lkotlin/coroutines/CoroutineContext;", "_context", "<init>", "(LJM;Lkotlin/coroutines/CoroutineContext;)V", "(LJM;)V", "intercepted", "()LJM;", "", "releaseIntercepted", "()V", "Lkotlin/coroutines/CoroutineContext;", "LJM;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class LM extends AbstractC7487wq {

    @Nullable
    private final CoroutineContext _context;

    @Nullable
    private transient JM<Object> intercepted;

    public LM(@Nullable JM<Object> jm, @Nullable CoroutineContext coroutineContext) {
        super(jm);
        this._context = coroutineContext;
    }

    @Override // defpackage.JM
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    @NotNull
    public final JM<Object> intercepted() {
        JM<Object> jmU = this.intercepted;
        if (jmU == null) {
            d dVar = (d) getContext().p(d.f);
            jmU = dVar != null ? dVar.u(this) : this;
            this.intercepted = jmU;
        }
        return jmU;
    }

    @Override // defpackage.AbstractC7487wq
    public void releaseIntercepted() {
        JM<?> jm = this.intercepted;
        if (jm != null && jm != this) {
            CoroutineContext.Element elementP = getContext().p(d.f);
            Intrinsics.checkNotNull(elementP);
            ((d) elementP).V0(jm);
        }
        this.intercepted = NG.d;
    }

    public LM(@Nullable JM<Object> jm) {
        this(jm, jm != null ? jm.getContext() : null);
    }
}
