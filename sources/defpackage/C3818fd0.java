package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {101}, m = "readScope")
public final class C3818fd0<R> extends LM {
    public C4238hd0 d;
    public C2397Xc0 e;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C4238hd0<Object> i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3818fd0(C4238hd0 c4238hd0, LM lm) {
        super(lm);
        this.i = c4238hd0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.d(null, this);
    }
}
