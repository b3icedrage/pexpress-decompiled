package defpackage;

import androidx.fragment.app.FragmentManager;
import com.base.feature.platform.screens.platform_webview.PlatformFragmentBase;
import defpackage.AbstractC2140Ue1;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: le1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.platform.screens.platform_webview.PlatformFragmentBase", f = "PlatformFragmentBase.kt", l = {127}, m = "showDownloadAppDialog$suspendImpl")
public final class C5131le1<VM extends AbstractC2140Ue1> extends LM {
    public PlatformFragmentBase d;
    public C1280Je1 e;
    public String[] g;
    public String[] h;
    public List i;
    public FragmentManager j;
    public AbstractC2140Ue1 k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ PlatformFragmentBase<VM> r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5131le1(PlatformFragmentBase platformFragmentBase, LM lm) {
        super(lm);
        this.r = platformFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return PlatformFragmentBase.y(this.r, this);
    }
}
