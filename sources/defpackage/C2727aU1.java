package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.analytics.providers.SubIdProviderBase", f = "SubIdProviderBase.kt", l = {RequestError.NO_DEV_KEY}, m = "getAppSetId")
public final class C2727aU1 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C2951bU1 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2727aU1(C2951bU1 c2951bU1, JM<? super C2727aU1> jm) {
        super(jm);
        this.e = c2951bU1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
