package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.support.screens.common.SupportViewModelBase", f = "SupportViewModelBase.kt", l = {55}, m = "updateScreenParts")
public final class C6156qW1 extends LM {
    public C5316mW1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C5316mW1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6156qW1(C5316mW1 c5316mW1, LM lm) {
        super(lm);
        this.g = c5316mW1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C5316mW1.m(this.g, this);
    }
}
