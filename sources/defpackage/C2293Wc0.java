package defpackage;

import java.io.FileInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", l = {169, 178}, m = "readData$suspendImpl")
public final class C2293Wc0<T> extends LM {
    public Object d;
    public FileInputStream e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C2397Xc0<T> h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2293Wc0(C2397Xc0 c2397Xc0, LM lm) {
        super(lm);
        this.h = c2397Xc0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return C2397Xc0.f(this.h, this);
    }
}
