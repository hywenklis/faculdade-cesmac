import { StatusBar } from 'expo-status-bar';
import { Button, StyleSheet, Text, View } from 'react-native';
import LoginScreen from ''

export default function App() {
  return (
    <View style={styles.container}>
      <Text>Olá Mundo!</Text>
      <StatusBar style="auto" />
      <Button title='Clique-me' onPress={() => console.log('Clicou')}></Button>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});