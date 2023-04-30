import { Button, StyleSheet, Text, TextInput, View } from 'react-native';
 
export default function App() {
 
  return (
    <View style={styles.container}>
      <View style={styles.linha}>
        <Text style={styles.texto}>Valor 1: </Text>
        <Text style={styles.texto}>Valor 2: </Text>
      </View>
 
      <View style={styles.linha}>
        <TextInput  placeholder="Digite o valor 1" keyboardType='decimal-pad' onChangeText={(valor) => valor1 = +valor}/>
        <TextInput  placeholder="Digite o valor 2" keyboardType='decimal-pad'/>
      </View>
 
      <Button title="Calcular" />
 
      <View style={[styles.linha, {marginTop: 30}]}>
        <Text style={styles.texto}>Resultado: </Text>
        <Text style={styles.texto}></Text>
      </View>
 
    </View>
  );
}
 
const styles = StyleSheet.create({
  container: {
    padding: 50
  },
  texto: { fontSize: 16},
  linha: {
    flexDirection: 'row',
    justifyContent: 'space-between'
    
  }
});
 