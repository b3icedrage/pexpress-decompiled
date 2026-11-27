package defpackage;

import com.jivosite.sdk.model.pojo.CustomData;
import com.jivosite.sdk.model.pojo.socket.SocketMessage;
import com.jivosite.sdk.model.repository.contacts.ContactForm;
import com.jivosite.sdk.support.builders.ContactInfo;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7801yL extends OP1<CL> implements InterfaceC7170vL {

    @NotNull
    public final EK1 f;

    @NotNull
    public final C3903g11 g;

    @NotNull
    public final R42 h;

    @NotNull
    public final InterfaceC4855kK i;

    /* JADX INFO: renamed from: yL$a */
    public static final class a extends ML0 implements Function1<OP1.a<CL>, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<CL> aVar) {
            OP1.a<CL> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            C7381wL call = new C7381wL(C7801yL.this);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.b = call;
            updateStateInRepositoryThread.a(C7591xL.d);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: yL$b */
    public static final class b extends ML0 implements Function1<OP1.a<CL>, Unit> {
        public final /* synthetic */ ContactForm d;
        public final /* synthetic */ C7801yL e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ContactForm contactForm, C7801yL c7801yL) {
            super(1);
            this.d = contactForm;
            this.e = c7801yL;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(OP1.a<CL> aVar) {
            OP1.a<CL> updateStateInRepositoryThread = aVar;
            Intrinsics.checkNotNullParameter(updateStateInRepositoryThread, "$this$updateStateInRepositoryThread");
            C8011zL call = new C8011zL(this.d);
            updateStateInRepositoryThread.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            updateStateInRepositoryThread.c = call;
            AL call2 = new AL(this.e);
            Intrinsics.checkNotNullParameter(call2, "call");
            updateStateInRepositoryThread.d = call2;
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7801yL(@NotNull InterfaceC5889pD1 schedulers, @NotNull EK1 storage, @NotNull C3903g11 moshi, @NotNull R42 messageTransmitter, @NotNull InterfaceC4855kK connectionStateRepository) {
        super(schedulers, "ContactForm", new CL(storage.b(), 2));
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(messageTransmitter, "messageTransmitter");
        Intrinsics.checkNotNullParameter(connectionStateRepository, "connectionStateRepository");
        this.f = storage;
        this.g = moshi;
        this.h = messageTransmitter;
        this.i = connectionStateRepository;
    }

    @Override // defpackage.InterfaceC7170vL
    public final void F(@Nullable ContactInfo contactInfo) {
        C3903g11 c3903g11 = this.g;
        EK1 ek1 = this.f;
        if (contactInfo == null) {
            if (!R() || ek1.b()) {
                return;
            }
            IJ0<Object>[] ij0Arr = EK1.z;
            IJ0<Object> ij0 = ij0Arr[20];
            C6749tK1 c6749tK1 = ek1.r;
            if (StringsKt.I((String) c6749tK1.a(ij0, ek1))) {
                return;
            }
            String str = (String) c6749tK1.a(ij0Arr[20], ek1);
            ContactInfo contactInfo2 = (ContactInfo) (!StringsKt.I(str) ? c3903g11.a(ContactInfo.class).b(str) : null);
            if (contactInfo2 != null) {
                S(contactInfo2);
                return;
            }
            return;
        }
        String strD = c3903g11.a(ContactInfo.class).d(contactInfo);
        Intrinsics.checkNotNullExpressionValue(strD, "this.adapter(T::class.java).toJson(data)");
        ek1.getClass();
        IJ0<Object>[] ij0Arr2 = EK1.z;
        IJ0<Object> ij1 = ij0Arr2[20];
        C6749tK1 c6749tK2 = ek1.r;
        if (!strD.equals((String) c6749tK2.a(ij1, ek1))) {
            ek1.s.b(ij0Arr2[21], Boolean.FALSE);
            Intrinsics.checkNotNullParameter(strD, "<set-?>");
            c6749tK2.b(ij0Arr2[20], strD);
        }
        if (!R() || ek1.b()) {
            return;
        }
        S(contactInfo);
    }

    @Override // defpackage.InterfaceC7170vL
    public final void M(@Nullable List<CustomData> list) {
        R42 r42 = this.h;
        EK1 ek1 = this.f;
        if (list == null) {
            if (R()) {
                ek1.getClass();
                IJ0<Object>[] ij0Arr = EK1.z;
                IJ0<Object> ij0 = ij0Arr[26];
                C6749tK1 c6749tK1 = ek1.x;
                if (((Boolean) c6749tK1.a(ij0, ek1)).booleanValue()) {
                    return;
                }
                IJ0<Object> ij1 = ij0Arr[25];
                C6749tK1 c6749tK2 = ek1.w;
                if (StringsKt.I((String) c6749tK2.a(ij1, ek1))) {
                    return;
                }
                String data = (String) c6749tK2.a(ij0Arr[25], ek1);
                Intrinsics.checkNotNullParameter(data, "data");
                r42.a(new SocketMessage("atom/user.custom-data", data, null, null, null, null, null, 124, null));
                c6749tK1.b(ij0Arr[26], Boolean.TRUE);
                return;
            }
            return;
        }
        C6596sc2.b bVarD = C6918u72.d(List.class, CustomData.class);
        C3903g11 c3903g11 = this.g;
        c3903g11.getClass();
        String data2 = c3903g11.c(bVarD, C6596sc2.a, null).d(list);
        ek1.getClass();
        IJ0<Object>[] ij0Arr2 = EK1.z;
        IJ0<Object> ij2 = ij0Arr2[25];
        C6749tK1 c6749tK3 = ek1.w;
        boolean zEquals = data2.equals((String) c6749tK3.a(ij2, ek1));
        C6749tK1 c6749tK4 = ek1.x;
        if (!zEquals) {
            c6749tK4.b(ij0Arr2[26], Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(data2, "jsonCustomData");
            Intrinsics.checkNotNullParameter(data2, "<set-?>");
            c6749tK3.b(ij0Arr2[25], data2);
        }
        if (!R() || ((Boolean) c6749tK4.a(ij0Arr2[26], ek1)).booleanValue()) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(data2, "jsonCustomData");
        Intrinsics.checkNotNullParameter(data2, "data");
        r42.a(new SocketMessage("atom/user.custom-data", data2, null, null, null, null, null, 124, null));
        c6749tK4.b(ij0Arr2[26], Boolean.TRUE);
    }

    public final boolean R() {
        return Intrinsics.a(this.i.getState().d(), AbstractC4645jK.a.a);
    }

    public final void S(ContactInfo contactInfo) {
        Pair pair = new Pair("atom/user.name", contactInfo.a);
        String str = contactInfo.b;
        Pair pair2 = new Pair("atom/user.email", str);
        String str2 = contactInfo.c;
        for (Map.Entry entry : PW0.e(pair, pair2, new Pair("atom/user.phone", str2), new Pair("atom/user.desc", contactInfo.d)).entrySet()) {
            String type = (String) entry.getKey();
            String data = (String) entry.getValue();
            if (data != null && !StringsKt.I(data)) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(data, "data");
                this.h.a(new SocketMessage(type, data, null, null, null, null, null, 124, null));
            }
        }
        if (!StringsKt.I(str) || !StringsKt.I(str2)) {
            EK1 ek1 = this.f;
            ek1.getClass();
            ek1.s.b(EK1.z[21], Boolean.TRUE);
        }
        C6104qF0.e("Contact info sent successfully");
    }

    @Override // defpackage.InterfaceC7170vL
    @NotNull
    public final KP1<CL> a() {
        return this.e;
    }

    @Override // defpackage.InterfaceC7170vL
    public final void n(boolean z) {
        Long l = z ? 1000L : null;
        Q(l != null ? l.longValue() : 0L, new a());
    }

    @Override // defpackage.InterfaceC7170vL
    public final void t(@NotNull ContactForm contactForm) {
        Intrinsics.checkNotNullParameter(contactForm, "contactForm");
        Q(0L, new b(contactForm, this));
    }
}
