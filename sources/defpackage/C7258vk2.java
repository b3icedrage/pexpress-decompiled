package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: vk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7258vk2 implements InterfaceC6418rk2 {
    public final WorkDatabase_Impl a;
    public final C6628sk2 b;
    public final C6838tk2 c;
    public final C7048uk2 d;

    public C7258vk2(WorkDatabase_Impl database) {
        this.a = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.b = new C6628sk2(database);
        this.c = new C6838tk2(database);
        this.d = new C7048uk2(database);
    }

    @Override // defpackage.InterfaceC6418rk2
    public final void a(String str) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkProgressDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        C6838tk2 c6838tk2 = this.c;
        InterfaceC4005gW1 interfaceC4005gW1A = c6838tk2.a();
        if (str == null) {
            interfaceC4005gW1A.P0(1);
        } else {
            interfaceC4005gW1A.F(1, str);
        }
        workDatabase_Impl.c();
        try {
            interfaceC4005gW1A.M();
            workDatabase_Impl.n();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.o(EnumC4869kO1.OK);
            }
        } finally {
            workDatabase_Impl.j();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            c6838tk2.d(interfaceC4005gW1A);
        }
    }

    @Override // defpackage.InterfaceC6418rk2
    public final void b(C6209qk2 c6209qk2) {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkProgressDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            this.b.f(c6209qk2);
            workDatabase_Impl.n();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.o(EnumC4869kO1.OK);
            }
        } finally {
            workDatabase_Impl.j();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
        }
    }

    @Override // defpackage.InterfaceC6418rk2
    public final void c() {
        InterfaceC2347Wu0 interfaceC2347Wu0F = QF1.f();
        InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0F != null ? interfaceC2347Wu0F.y("db.sql.room", "androidx.work.impl.model.WorkProgressDao") : null;
        WorkDatabase_Impl workDatabase_Impl = this.a;
        workDatabase_Impl.b();
        C7048uk2 c7048uk2 = this.d;
        InterfaceC4005gW1 interfaceC4005gW1A = c7048uk2.a();
        workDatabase_Impl.c();
        try {
            interfaceC4005gW1A.M();
            workDatabase_Impl.n();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.o(EnumC4869kO1.OK);
            }
        } finally {
            workDatabase_Impl.j();
            if (interfaceC2347Wu0Y != null) {
                interfaceC2347Wu0Y.l();
            }
            c7048uk2.d(interfaceC4005gW1A);
        }
    }
}
