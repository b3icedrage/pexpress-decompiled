package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LAW1;", "LLM;", "LPj0;", "", "", "arity", "LJM;", "completion", "<init>", "(ILJM;)V", "(I)V", "", "toString", "()Ljava/lang/String;", "I", "getArity", "()I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AW1 extends LM implements InterfaceC1764Pj0<Object> {
    private final int arity;

    public AW1(int i, @Nullable JM<Object> jm) {
        super(jm);
        this.arity = i;
    }

    @Override // defpackage.InterfaceC1764Pj0
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strH = C2017Sp1.a.h(this);
        Intrinsics.checkNotNullExpressionValue(strH, "renderLambdaToString(...)");
        return strH;
    }

    public AW1(int i) {
        this(i, null);
    }
}
