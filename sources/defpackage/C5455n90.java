package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: n90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.EventsProviderImpl", f = "EventsProviderImpl.kt", l = {89, 91, 94, 98, 102}, m = "proceedData")
public final class C5455n90<T> extends LM {
    public Object d;
    public InterfaceC1060Gj0 e;
    public Function g;
    public Object h;
    public Object i;
    public Object j;
    public Iterator k;
    public Collection l;
    public /* synthetic */ Object m;
    public final /* synthetic */ A90 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5455n90(A90 a90, LM lm) {
        super(lm);
        this.n = a90;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, null, null, null, null, this);
    }
}
