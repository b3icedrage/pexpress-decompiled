package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import defpackage.AbstractC6769tR0;
import defpackage.C6349rR0;

/* JADX INFO: loaded from: classes.dex */
final class zbw implements AbstractC6769tR0.a {
    final /* synthetic */ SignInHubActivity zba;

    public /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }

    @Override // defpackage.AbstractC6769tR0.a
    public final C6349rR0 onCreateLoader(int i, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // defpackage.AbstractC6769tR0.a
    public final /* bridge */ /* synthetic */ void onLoadFinished(C6349rR0 c6349rR0, Object obj) {
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(signInHubActivity.zbe, signInHubActivity.zbf);
        this.zba.finish();
    }

    @Override // defpackage.AbstractC6769tR0.a
    public final void onLoaderReset(C6349rR0 c6349rR0) {
    }
}
