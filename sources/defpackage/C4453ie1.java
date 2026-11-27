package defpackage;

import com.base.feature.platform.screens.platform_webview.PlatformFragmentBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ie1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.platform.screens.platform_webview.PlatformFragmentBase", f = "PlatformFragmentBase.kt", l = {54, 61}, m = "initPlatform")
public final class C4453ie1 extends LM {
    public PlatformFragmentBase d;
    public /* synthetic */ Object e;
    public final /* synthetic */ PlatformFragmentBase<AbstractC2140Ue1> g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4453ie1(PlatformFragmentBase platformFragmentBase, LM lm) {
        super(lm);
        this.g = platformFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.x(this);
    }
}
