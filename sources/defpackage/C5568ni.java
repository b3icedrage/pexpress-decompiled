package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.AppUpdatesManagerImpl", f = "AppUpdatesManagerImpl.kt", l = {81}, m = "checkForStoreUpdateStatus")
public final class C5568ni extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C5358mi e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5568ni(C5358mi c5358mi, LM lm) {
        super(lm);
        this.e = c5358mi;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
