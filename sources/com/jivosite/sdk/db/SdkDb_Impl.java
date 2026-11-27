package com.jivosite.sdk.db;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.AbstractC3899g01;
import defpackage.C3043bv;
import defpackage.C3057c;
import defpackage.C3213cj0;
import defpackage.C4428iX1;
import defpackage.C4882kT;
import defpackage.C7775yC0;
import defpackage.C7970z8;
import defpackage.InterfaceC3376dW1;
import defpackage.InterfaceC7339w8;
import defpackage.QA1;
import defpackage.RA1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SdkDb_Impl extends SdkDb {
    public volatile C7970z8 l;

    public class a extends RA1.a {
        public a() {
            super(1);
        }

        @Override // RA1.a
        public final void a(C3213cj0 c3213cj0) {
            c3213cj0.E("CREATE TABLE IF NOT EXISTS `agent` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `title` TEXT NOT NULL, `photo` TEXT NOT NULL, PRIMARY KEY(`id`))");
            c3213cj0.E("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            c3213cj0.E("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f7a4e36ce8c5fb2621ccc18f3ee5a602')");
        }

        @Override // RA1.a
        public final void b(C3213cj0 db) {
            db.E("DROP TABLE IF EXISTS `agent`");
            SdkDb_Impl sdkDb_Impl = SdkDb_Impl.this;
            ArrayList arrayList = sdkDb_Impl.f;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((QA1.b) sdkDb_Impl.f.get(i)).getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                }
            }
        }

        @Override // RA1.a
        public final void c(C3213cj0 db) {
            SdkDb_Impl sdkDb_Impl = SdkDb_Impl.this;
            ArrayList arrayList = sdkDb_Impl.f;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((QA1.b) sdkDb_Impl.f.get(i)).getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                }
            }
        }

        @Override // RA1.a
        public final void d(C3213cj0 c3213cj0) {
            SdkDb_Impl.this.a = c3213cj0;
            SdkDb_Impl.this.k(c3213cj0);
            ArrayList arrayList = SdkDb_Impl.this.f;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((QA1.b) SdkDb_Impl.this.f.get(i)).a(c3213cj0);
                }
            }
        }

        @Override // RA1.a
        public final void e(C3213cj0 c3213cj0) throws IOException {
            C3043bv.d(c3213cj0);
        }

        @Override // RA1.a
        public final RA1.b f(C3213cj0 c3213cj0) {
            HashMap map = new HashMap(4);
            map.put("id", new C4428iX1.a("id", "INTEGER", true, 1, null, 1));
            map.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new C4428iX1.a(AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", true, 0, null, 1));
            map.put("title", new C4428iX1.a("title", "TEXT", true, 0, null, 1));
            map.put("photo", new C4428iX1.a("photo", "TEXT", true, 0, null, 1));
            C4428iX1 c4428iX1 = new C4428iX1("agent", map, new HashSet(0), new HashSet(0));
            C4428iX1 c4428iX1A = C4428iX1.a(c3213cj0, "agent");
            if (c4428iX1.equals(c4428iX1A)) {
                return new RA1.b(true, null);
            }
            return new RA1.b(false, "agent(com.jivosite.sdk.db.entities.DbAgent).\n Expected:\n" + c4428iX1 + "\n Found:\n" + c4428iX1A);
        }
    }

    @Override // defpackage.QA1
    public final C7775yC0 d() {
        return new C7775yC0(this, new HashMap(0), new HashMap(0), "agent");
    }

    @Override // defpackage.QA1
    public final InterfaceC3376dW1 e(C4882kT c4882kT) {
        RA1 callback = new RA1(c4882kT, new a(), "f7a4e36ce8c5fb2621ccc18f3ee5a602", "8eb9e003bc52c2c8e3103ab580a386a5");
        Context context = c4882kT.a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return c4882kT.c.a(new InterfaceC3376dW1.b(context, c4882kT.b, callback, false, false));
    }

    @Override // defpackage.QA1
    public final List f(@NonNull LinkedHashMap linkedHashMap) {
        return Arrays.asList(new AbstractC3899g01[0]);
    }

    @Override // defpackage.QA1
    public final Set<Class<? extends C3057c>> h() {
        return new HashSet();
    }

    @Override // defpackage.QA1
    public final Map<Class<?>, List<Class<?>>> i() {
        HashMap map = new HashMap();
        map.put(InterfaceC7339w8.class, Collections.EMPTY_LIST);
        return map;
    }

    @Override // com.jivosite.sdk.db.SdkDb
    public final InterfaceC7339w8 p() {
        C7970z8 c7970z8;
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new C7970z8(this);
                }
                c7970z8 = this.l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c7970z8;
    }
}
