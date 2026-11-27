package defpackage;

import com.api.core.backend.domain.models.resultModels.ResultOk;
import com.impl.core.backend.modelsResponse.AllAssetsResponse;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3635ek implements InterfaceC6396rf0<ResultOk<? extends AllAssetsResponse>> {
    public final /* synthetic */ C1596Nf0 d;

    /* JADX INFO: renamed from: ek$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;

        /* JADX INFO: renamed from: ek$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.impl.core.backend.data_sources.AssetsDataSourceImpl$subscribeAssetChanged$$inlined$map$1$2", f = "AssetsDataSourceImpl.kt", l = {219}, m = "emit")
        public static final class C0346a extends LM {
            public /* synthetic */ Object d;
            public int e;

            public C0346a(JM jm) {
                super(jm);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.d = obj;
                this.e |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(InterfaceC6606sf0 interfaceC6606sf0) {
            this.d = interfaceC6606sf0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(Object obj, @NotNull JM jm) {
            C0346a c0346a;
            if (jm instanceof C0346a) {
                c0346a = (C0346a) jm;
                int i = c0346a.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0346a.e = i - Integer.MIN_VALUE;
                } else {
                    c0346a = new C0346a(jm);
                }
            } else {
                c0346a = new C0346a(jm);
            }
            Object obj2 = c0346a.d;
            MN mn = MN.d;
            int i2 = c0346a.e;
            if (i2 == 0) {
                C1795Pt1.b(obj2);
                List list = (List) obj;
                if (list == null) {
                    list = C5653o60.d;
                }
                ResultOk resultOk = new ResultOk(new AllAssetsResponse(list));
                c0346a.e = 1;
                if (this.d.a(resultOk, c0346a) == mn) {
                    return mn;
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

    public C3635ek(C1596Nf0 c1596Nf0) {
        this.d = c1596Nf0;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super ResultOk<? extends AllAssetsResponse>> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
