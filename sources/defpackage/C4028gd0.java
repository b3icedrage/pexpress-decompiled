package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {214, 118}, m = "writeScope")
public final class C4028gd0 extends LM {
    public C4238hd0 d;
    public Object e;
    public Object g;
    public C5339md0 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C4238hd0<Object> j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4028gd0(C4238hd0 c4238hd0, LM lm) {
        super(lm);
        this.j = c4238hd0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.c(null, this);
    }
}
