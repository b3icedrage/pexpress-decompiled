package defpackage;

import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.jivosite.sdk.db.SdkDb_Impl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: z8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7970z8 implements InterfaceC7339w8, Jm2 {
    public final Object d;
    public final Object e;
    public final Object g;

    public C7970z8(Jm2 jm2, Jm2 jm3, C2698aL c2698aL) {
        this.d = jm2;
        this.e = jm3;
        this.g = c2698aL;
    }

    @Override // defpackage.InterfaceC7339w8
    public ArrayList a() {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "com.jivosite.sdk.db.dao.AgentDao") : null;
        SA1 sa1G = SA1.g(0, "SELECT * FROM agent");
        SdkDb_Impl sdkDb_Impl = (SdkDb_Impl) this.d;
        sdkDb_Impl.b();
        Cursor cursorF = C3043bv.f(sdkDb_Impl, sa1G);
        try {
            int iN = UE.n(cursorF, "id");
            int iN2 = UE.n(cursorF, AppMeasurementSdk.ConditionalUserProperty.NAME);
            int iN3 = UE.n(cursorF, "title");
            int iN4 = UE.n(cursorF, "photo");
            ArrayList arrayList = new ArrayList(cursorF.getCount());
            while (cursorF.moveToNext()) {
                arrayList.add(new XT(cursorF.getLong(iN), cursorF.isNull(iN2) ? null : cursorF.getString(iN2), cursorF.isNull(iN3) ? null : cursorF.getString(iN3), cursorF.isNull(iN4) ? null : cursorF.getString(iN4)));
            }
            return arrayList;
        } finally {
            cursorF.close();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            sa1G.release();
        }
    }

    @Override // defpackage.InterfaceC7339w8
    public void b(XT xt) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "com.jivosite.sdk.db.dao.AgentDao") : null;
        SdkDb_Impl sdkDb_Impl = (SdkDb_Impl) this.d;
        sdkDb_Impl.b();
        sdkDb_Impl.c();
        try {
            ((C7550x8) this.e).f(xt);
            sdkDb_Impl.n();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.o(EnumC4869kO1.OK);
            }
        } finally {
            sdkDb_Impl.j();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
        }
    }

    @Override // defpackage.InterfaceC7339w8
    public void c(XT xt) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "com.jivosite.sdk.db.dao.AgentDao") : null;
        SdkDb_Impl sdkDb_Impl = (SdkDb_Impl) this.d;
        sdkDb_Impl.b();
        sdkDb_Impl.c();
        try {
            C7760y8 c7760y8 = (C7760y8) this.g;
            InterfaceC4005gW1 interfaceC4005gW1A = c7760y8.a();
            try {
                long j = xt.a;
                interfaceC4005gW1A.n0(1, j);
                String str = xt.b;
                if (str == null) {
                    interfaceC4005gW1A.P0(2);
                } else {
                    interfaceC4005gW1A.F(2, str);
                }
                String str2 = xt.c;
                if (str2 == null) {
                    interfaceC4005gW1A.P0(3);
                } else {
                    interfaceC4005gW1A.F(3, str2);
                }
                String str3 = xt.d;
                if (str3 == null) {
                    interfaceC4005gW1A.P0(4);
                } else {
                    interfaceC4005gW1A.F(4, str3);
                }
                interfaceC4005gW1A.n0(5, j);
                interfaceC4005gW1A.M();
                c7760y8.d(interfaceC4005gW1A);
                sdkDb_Impl.n();
                if (interfaceC2347Wu0Y != null) {
                    interfaceC2347Wu0Y.o(EnumC4869kO1.OK);
                }
                sdkDb_Impl.j();
                if (interfaceC2347Wu0Y != null) {
                    interfaceC2347Wu0Y.l();
                }
            } catch (Throwable th) {
                c7760y8.d(interfaceC4005gW1A);
                throw th;
            }
        } catch (Throwable th2) {
            sdkDb_Impl.j();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            throw th2;
        }
    }

    @Override // defpackage.Jm2
    public Object zza() {
        return new C2798an2((rn2) ((Jm2) this.d).zza(), (Qm2) ((Jm2) this.e).zza(), (Context) ((C1602Nh0) ((C2698aL) this.g).d).d);
    }

    public C7970z8(List list) {
        this.g = list;
        this.d = new ArrayList(list.size());
        this.e = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            ((ArrayList) this.d).add(new C2697aK1((List) ((C5738oX0) list.get(i)).b.b));
            ((ArrayList) this.e).add(((C5738oX0) list.get(i)).c.j());
        }
    }

    public C7970z8(SdkDb_Impl database) {
        this.d = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.e = new C7550x8(database, 0);
        Intrinsics.checkNotNullParameter(database, "database");
        this.g = new C7760y8(database);
    }
}
