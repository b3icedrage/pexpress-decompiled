package defpackage;

import kotlin.Unit;
import kotlin.collections.IndexedValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7684xm<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ InterfaceC6606sf0 d;

    /* JADX INFO: renamed from: xm$a */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationScreenEventsKt$screenEvents$$inlined$mapNotNull$1$2", f = "AuthorizationScreenEvents.kt", l = {233}, m = "emit")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return C7684xm.this.a(null, this);
        }
    }

    public C7684xm(InterfaceC6606sf0 interfaceC6606sf0) {
        this.d = interfaceC6606sf0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(Object obj, @NotNull JM jm) {
        a aVar;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object obj2 = aVar.d;
        MN mn = MN.d;
        int i2 = aVar.e;
        if (i2 == 0) {
            C1795Pt1.b(obj2);
            IndexedValue indexedValue = (IndexedValue) obj;
            int i3 = indexedValue.a;
            int iOrdinal = ((N42) indexedValue.b).ordinal();
            C7474wm c7474wm = null;
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    c7474wm = new C7474wm(EnumC5028l80.t, null);
                }
            } else if (i3 != 0) {
                EnumC5028l80 enumC5028l80 = EnumC5028l80.o;
                L80 l80 = L80.MAX_PROFIT;
                c7474wm = new C7474wm(enumC5028l80, new C1510Md1("Login"));
            }
            if (c7474wm != null) {
                aVar.e = 1;
                if (this.d.a(c7474wm, aVar) == mn) {
                    return mn;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj2);
        }
        return Unit.a;
    }
}
