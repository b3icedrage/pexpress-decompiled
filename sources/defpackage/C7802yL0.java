package defpackage;

import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter", f = "KotlinxSerializationConverter.kt", l = {59}, m = "serializeNullable")
public final class C7802yL0 extends LM {
    public AL0 d;
    public C4651jM e;
    public Charset g;
    public A62 h;
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ AL0 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7802yL0(AL0 al0, LM lm) {
        super(lm);
        this.k = al0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, null, null, null, this);
    }
}
