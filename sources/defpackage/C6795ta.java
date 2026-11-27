package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.config.RemoteConfigManager;
import io.jsonwebtoken.JwtParser;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.cache.b;
import io.sentry.util.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6795ta implements InterfaceC7636xa, OnSuccessListener, MD1, l.a {
    public final /* synthetic */ Object d;

    public /* synthetic */ C6795ta(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.InterfaceC7636xa
    public void a(Bundle bundle) {
        ((C7215va) this.d).a.a(bundle);
    }

    @Override // io.sentry.util.l.a
    public Object b() {
        return ((b) this.d).d.getSerializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 it) {
        int i = ReplayIntegration.v;
        Intrinsics.checkNotNullParameter(it, "it");
        String strI = it.I();
        ((C3027bp1) this.d).d = strI != null ? StringsKt.W(JwtParser.SEPARATOR_CHAR, strI, strI) : 0;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((RemoteConfigManager) this.d).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }
}
