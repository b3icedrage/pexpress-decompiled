package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oi2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.utils.WebViewScriptsManager", f = "WebViewScriptsManager.kt", l = {48}, m = "loadAndGetScript")
public final class C5781oi2 extends LM {
    public C6201qi2 d;
    public String e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C6201qi2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5781oi2(C6201qi2 c6201qi2, LM lm) {
        super(lm);
        this.h = c6201qi2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
