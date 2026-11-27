package com.impl.core.backend;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.PX;

/* JADX INFO: loaded from: classes.dex */
public final class a implements DepositMadeWorker.a {
    public final PX a;

    public a(PX px) {
        this.a = px;
    }

    @Override // com.impl.core.backend.DepositMadeWorker.a
    public final DepositMadeWorker a(Context context, WorkerParameters workerParameters) {
        PX px = this.a;
        return new DepositMadeWorker(context, workerParameters, px.a.get(), px.b.get(), px.c.get(), px.d.get());
    }
}
