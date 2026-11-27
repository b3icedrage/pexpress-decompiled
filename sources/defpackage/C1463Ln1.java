package defpackage;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ln1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.utils.io.jvm.javaio.ReadingKt$toByteReadChannel$2", f = "Reading.kt", l = {90}, m = "invokeSuspend")
public final class C1463Ln1 extends AW1 implements Function2<InterfaceC5583nl2, JM<? super Unit>, Object> {
    public byte[] d;
    public int e;
    public /* synthetic */ Object g;
    public final /* synthetic */ O71<byte[]> h;
    public final /* synthetic */ InputStream i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1463Ln1(O71<byte[]> o71, InputStream inputStream, JM<? super C1463Ln1> jm) {
        super(2, jm);
        this.h = o71;
        this.i = inputStream;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C1463Ln1 c1463Ln1 = new C1463Ln1(this.h, this.i, jm);
        c1463Ln1.g = obj;
        return c1463Ln1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC5583nl2 interfaceC5583nl2, JM<? super Unit> jm) {
        return ((C1463Ln1) create(interfaceC5583nl2, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws IOException {
        byte[] bArrS;
        InterfaceC5583nl2 interfaceC5583nl2;
        MN mn = MN.d;
        int i = this.e;
        InputStream inputStream = this.i;
        O71<byte[]> o71 = this.h;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC5583nl2 interfaceC5583nl3 = (InterfaceC5583nl2) this.g;
            bArrS = o71.S();
            interfaceC5583nl2 = interfaceC5583nl3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArrS = this.d;
            interfaceC5583nl2 = (InterfaceC5583nl2) this.g;
            try {
                C1795Pt1.b(obj);
            } catch (Throwable th) {
                try {
                    interfaceC5583nl2.i0().a(th);
                    o71.g1(bArrS);
                } finally {
                    o71.g1(bArrS);
                    inputStream.close();
                }
            }
        }
        while (true) {
            int i2 = inputStream.read(bArrS, 0, bArrS.length);
            if (i2 < 0) {
                o71.g1(bArrS);
                return Unit.a;
            }
            if (i2 != 0) {
                InterfaceC6245qw interfaceC6245qwI0 = interfaceC5583nl2.i0();
                this.g = interfaceC5583nl2;
                this.d = bArrS;
                this.e = 1;
                if (interfaceC6245qwI0.g(bArrS, i2, this) == mn) {
                    return mn;
                }
            }
        }
    }
}
