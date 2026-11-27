package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: od1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5760od1 implements Parcelable {
    public static final Parcelable.Creator<C5760od1> CREATOR = new a();
    public final String d;
    public final QZ1 e;
    public boolean g;

    /* JADX INFO: renamed from: od1$a */
    public class a implements Parcelable.Creator<C5760od1> {
        @Override // android.os.Parcelable.Creator
        public final C5760od1 createFromParcel(@NonNull Parcel parcel) {
            return new C5760od1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C5760od1[] newArray(int i) {
            return new C5760od1[i];
        }
    }

    public C5760od1(String str, C5207m c5207m) {
        this.g = false;
        this.d = str;
        this.e = new QZ1();
    }

    public static C5970pd1[] b(@NonNull List<C5760od1> list) {
        if (list.isEmpty()) {
            return null;
        }
        C5970pd1[] c5970pd1Arr = new C5970pd1[list.size()];
        C5970pd1 c5970pd1A = list.get(0).a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            C5970pd1 c5970pd1A2 = list.get(i).a();
            if (z || !list.get(i).g) {
                c5970pd1Arr[i] = c5970pd1A2;
            } else {
                c5970pd1Arr[0] = c5970pd1A2;
                c5970pd1Arr[i] = c5970pd1A;
                z = true;
            }
        }
        if (!z) {
            c5970pd1Arr[0] = c5970pd1A;
        }
        return c5970pd1Arr;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:25:0x009f  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    public static C5760od1 c() {
        boolean z;
        C3754fJ c3754fJ;
        C2745aa1<Float> c2745aa1;
        C2745aa1<Float> c2745aa1B;
        float fFloatValue;
        C5760od1 c5760od1 = new C5760od1(UUID.randomUUID().toString().replace("-", ""), new C5207m());
        C8002zI c8002zIE = C8002zI.e();
        if (c8002zIE.o()) {
            double dRandom = Math.random();
            synchronized (C3754fJ.class) {
                try {
                    if (C3754fJ.e == null) {
                        C3754fJ.e = new C3754fJ();
                    }
                    c3754fJ = C3754fJ.e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            C2745aa1<Float> c2745aa1I = c8002zIE.i(c3754fJ);
            if (c2745aa1I.b()) {
                fFloatValue = c2745aa1I.a().floatValue() / 100.0f;
                if (!C8002zI.p(fFloatValue)) {
                    c2745aa1 = c8002zIE.a.getFloat("fpr_vc_session_sampling_rate");
                    if (c2745aa1.b() || !C8002zI.p(c2745aa1.a().floatValue())) {
                        c2745aa1B = c8002zIE.b(c3754fJ);
                        if (c2745aa1B.b() || !C8002zI.p(c2745aa1B.a().floatValue())) {
                            fFloatValue = 0.01f;
                        } else {
                            fFloatValue = c2745aa1B.a().floatValue();
                        }
                    } else {
                        c8002zIE.c.d("com.google.firebase.perf.SessionSamplingRate", c2745aa1.a().floatValue());
                        fFloatValue = c2745aa1.a().floatValue();
                    }
                }
            } else {
                c2745aa1 = c8002zIE.a.getFloat("fpr_vc_session_sampling_rate");
                if (c2745aa1.b()) {
                    c2745aa1B = c8002zIE.b(c3754fJ);
                    if (c2745aa1B.b()) {
                        fFloatValue = 0.01f;
                    } else {
                        fFloatValue = 0.01f;
                    }
                } else {
                    c2745aa1B = c8002zIE.b(c3754fJ);
                    if (c2745aa1B.b()) {
                        fFloatValue = 0.01f;
                    } else {
                        fFloatValue = 0.01f;
                    }
                }
            }
            if (dRandom < fFloatValue) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        c5760od1.g = z;
        return c5760od1;
    }

    public final C5970pd1 a() {
        C5970pd1.b bVarA = C5970pd1.A();
        bVarA.p();
        C5970pd1.w((C5970pd1) bVarA.e, this.d);
        if (this.g) {
            bVarA.p();
            C5970pd1.x((C5970pd1) bVarA.e);
        }
        return bVarA.n();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.e, 0);
    }

    public C5760od1(Parcel parcel) {
        this.g = false;
        this.d = parcel.readString();
        this.g = parcel.readByte() != 0;
        this.e = (QZ1) parcel.readParcelable(QZ1.class.getClassLoader());
    }
}
