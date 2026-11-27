package defpackage;

import android.os.Build;
import androidx.work.b;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Hk2 extends AbstractC3297d70 {
    @Override // defpackage.CK1
    public final String c() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // defpackage.AbstractC3297d70
    public final void e(InterfaceC4005gW1 interfaceC4005gW1, Object obj) throws Throwable {
        int i;
        int i2;
        byte[] byteArray;
        Bk2 bk2 = (Bk2) obj;
        int i3 = 1;
        String str = bk2.a;
        if (str == null) {
            interfaceC4005gW1.P0(1);
        } else {
            interfaceC4005gW1.F(1, str);
        }
        interfaceC4005gW1.n0(2, C5027l8.x(bk2.b));
        String str2 = bk2.c;
        if (str2 == null) {
            interfaceC4005gW1.P0(3);
        } else {
            interfaceC4005gW1.F(3, str2);
        }
        String str3 = bk2.d;
        if (str3 == null) {
            interfaceC4005gW1.P0(4);
        } else {
            interfaceC4005gW1.F(4, str3);
        }
        byte[] bArrC = b.c(bk2.e);
        if (bArrC == null) {
            interfaceC4005gW1.P0(5);
        } else {
            interfaceC4005gW1.v0(5, bArrC);
        }
        byte[] bArrC2 = b.c(bk2.f);
        if (bArrC2 == null) {
            interfaceC4005gW1.P0(6);
        } else {
            interfaceC4005gW1.v0(6, bArrC2);
        }
        interfaceC4005gW1.n0(7, bk2.g);
        interfaceC4005gW1.n0(8, bk2.h);
        interfaceC4005gW1.n0(9, bk2.i);
        interfaceC4005gW1.n0(10, bk2.k);
        EnumC1544Mp backoffPolicy = bk2.l;
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int iOrdinal = backoffPolicy.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else {
            if (iOrdinal != 1) {
                throw new C6489s51();
            }
            i = 1;
        }
        interfaceC4005gW1.n0(11, i);
        interfaceC4005gW1.n0(12, bk2.m);
        interfaceC4005gW1.n0(13, bk2.n);
        interfaceC4005gW1.n0(14, bk2.o);
        interfaceC4005gW1.n0(15, bk2.p);
        interfaceC4005gW1.n0(16, bk2.q ? 1L : 0L);
        EnumC7428wa1 policy = bk2.r;
        Intrinsics.checkNotNullParameter(policy, "policy");
        int iOrdinal2 = policy.ordinal();
        if (iOrdinal2 == 0) {
            i2 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new C6489s51();
            }
            i2 = 1;
        }
        interfaceC4005gW1.n0(17, i2);
        interfaceC4005gW1.n0(18, bk2.s);
        interfaceC4005gW1.n0(19, bk2.t);
        VK vk = bk2.j;
        if (vk == null) {
            interfaceC4005gW1.P0(20);
            interfaceC4005gW1.P0(21);
            interfaceC4005gW1.P0(22);
            interfaceC4005gW1.P0(23);
            interfaceC4005gW1.P0(24);
            interfaceC4005gW1.P0(25);
            interfaceC4005gW1.P0(26);
            interfaceC4005gW1.P0(27);
            return;
        }
        EnumC4593j41 networkType = vk.a;
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int iOrdinal3 = networkType.ordinal();
        if (iOrdinal3 == 0) {
            i3 = 0;
        } else if (iOrdinal3 != 1) {
            if (iOrdinal3 == 2) {
                i3 = 2;
            } else if (iOrdinal3 == 3) {
                i3 = 3;
            } else if (iOrdinal3 == 4) {
                i3 = 4;
            } else {
                if (Build.VERSION.SDK_INT < 30 || networkType != EnumC4593j41.j) {
                    throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                }
                i3 = 5;
            }
        }
        interfaceC4005gW1.n0(20, i3);
        interfaceC4005gW1.n0(21, vk.b ? 1L : 0L);
        interfaceC4005gW1.n0(22, vk.c ? 1L : 0L);
        interfaceC4005gW1.n0(23, vk.d ? 1L : 0L);
        interfaceC4005gW1.n0(24, vk.e ? 1L : 0L);
        interfaceC4005gW1.n0(25, vk.f);
        interfaceC4005gW1.n0(26, vk.g);
        Set<VK.a> triggers = vk.h;
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            byteArray = new byte[0];
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeInt(triggers.size());
                    for (VK.a aVar : triggers) {
                        objectOutputStream.writeUTF(aVar.a.toString());
                        objectOutputStream.writeBoolean(aVar.b);
                    }
                    Unit unit = Unit.a;
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                    byteArray = byteArrayOutputStream.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        C6621sj.b(objectOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    C6621sj.b(byteArrayOutputStream, th3);
                    throw th4;
                }
            }
        }
        if (byteArray == null) {
            interfaceC4005gW1.P0(27);
        } else {
            interfaceC4005gW1.v0(27, byteArray);
        }
    }
}
