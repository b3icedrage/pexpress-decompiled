package defpackage;

import com.base.feature.platform.screens.platform_webview.PlatformFragmentBase;
import defpackage.AbstractC2140Ue1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ne1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.platform.screens.platform_webview.PlatformFragmentBase", f = "PlatformFragmentBase.kt", l = {76, 77, 78, 80}, m = "showOptionsDialog$suspendImpl")
public final class C5554ne1<VM extends AbstractC2140Ue1> extends LM {
    public PlatformFragmentBase d;
    public /* synthetic */ Object e;
    public final /* synthetic */ PlatformFragmentBase<VM> g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5554ne1(PlatformFragmentBase platformFragmentBase, LM lm) {
        super(lm);
        this.g = platformFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return PlatformFragmentBase.A(this.g, this);
    }
}
